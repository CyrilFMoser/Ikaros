package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C], b: (Boolean,Boolean)) extends T_A[C, D]
case class CC_B[E, F, G](a: Boolean, b: T_A[Boolean, E]) extends T_A[E, F]
case class CC_C[H]() extends T_A[H, CC_A[Byte, Char]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), (_,_)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_B Int Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: Pattern match is empty without constants