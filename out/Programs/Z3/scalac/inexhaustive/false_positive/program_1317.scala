package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[T_A[Int, C], C]
case class CC_B[E, D, F]() extends T_A[D, E]
case class CC_C[G]() extends T_A[G, (Boolean,Char)]

val v_a: T_A[T_A[Int, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(CC_B(), CC_B(), 'x') => 3 
  case CC_A(CC_B(), CC_B(), _) => 4 
  case CC_A(_, CC_B(), 'x') => 5 
  case CC_A(_, CC_B(), _) => 6 
  case CC_A(_, _, 'x') => 7 
  case CC_A(CC_B(), _, 'x') => 8 
}
}
// This is not matched: (CC_B Char (T_A Int Char) Boolean (T_A (T_A Int Char) Char))
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))