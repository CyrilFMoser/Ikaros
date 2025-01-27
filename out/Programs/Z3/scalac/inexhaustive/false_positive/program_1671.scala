package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_B[(Int,Boolean)]]
case class CC_B[E](a: E, b: T_B[E]) extends T_A[E, T_B[(Int,Boolean)]]
case class CC_C(a: T_A[Int, Int], b: Byte, c: T_A[Int, Byte]) extends T_B[Int]
case class CC_D[F](a: Int, b: (CC_C,(Int,Char))) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_C(_, 0, _) => 1 
  case CC_D(_, _) => 2 
  case CC_D(12, (CC_C(_, _, _),(_,_))) => 3 
}
}
// This is not matched: (CC_D Boolean Wildcard Wildcard (T_B Int))
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_B Boolean))