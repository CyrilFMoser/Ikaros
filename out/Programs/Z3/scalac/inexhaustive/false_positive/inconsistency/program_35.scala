package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: T_A[D, Char], b: (Boolean,Char)) extends T_A[D, T_A[D, Int]]

val v_a: T_A[Char, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_A T_A)