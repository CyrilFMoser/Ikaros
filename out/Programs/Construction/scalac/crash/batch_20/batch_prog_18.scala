package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean) extends T_A[C, T_A[T_A[Char, Boolean], (Char,Char)]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}