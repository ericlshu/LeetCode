package com.eric;

import org.junit.Test;
import com.eric.solution.graph.P0797AllPathsFromSourceToTarget;
import com.eric.solution.graph.P1971FindIfPathExistsInGraph;

/**
 * Description :
 *
 * @author Eric L SHU
 * @date 2022-12-19 19:26
 * @since jdk-11.0.14
 */
public class GraphTest
{
    @Test
    public void test1971()
    {
        int[][] edges1 = {{0, 1}, {1, 2}, {2, 0}};
        int[][] edges2 = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        P1971FindIfPathExistsInGraph p1971 = new P1971FindIfPathExistsInGraph();
        System.out.println(p1971.validPath_bfs(3, edges1, 0, 2));
        System.out.println(p1971.validPath_dfs(3, edges1, 0, 2));
        System.out.println(p1971.validPath_dfs(6, edges2, 0, 5));
        System.out.println(p1971.validPath_bfs(6, edges2, 0, 5));
    }

    @Test
    public void test0797()
    {
        P0797AllPathsFromSourceToTarget p0797 = new P0797AllPathsFromSourceToTarget();
        int[][] graph1 = {{1, 2}, {3}, {3}, {}};
        int[][] graph2 = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        System.out.println(p0797.allPathsSourceTarget_dfs(graph1));
        System.out.println(p0797.allPathsSourceTarget_bfs(graph2));
    }
}