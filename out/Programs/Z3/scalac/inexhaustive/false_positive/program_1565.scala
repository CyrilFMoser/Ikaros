package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: (Int,Char)) extends T_A[D, T_A[D, D]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_A Int (T_A Int (Tuple Boolean Char)))