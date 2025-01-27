package Program_14 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (Char,Char)) extends T_A[Int, T_A[Int, Int]]
case class CC_C[E, F](a: T_A[Int, F], b: E) extends T_A[E, F]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_B(('x','x')) => 2 
  case CC_B((_,'x')) => 3 
  case CC_C(_, _) => 4 
  case CC_C(CC_A(), 12) => 5 
  case CC_C(CC_B(_), 12) => 6 
}
}
// This is not matched: (CC_B Boolean (Tuple Char Wildcard) (T_A Int (T_A Int Int)))
// This is not matched: (CC_B Boolean Wildcard (T_A Int (T_A Int Int)))