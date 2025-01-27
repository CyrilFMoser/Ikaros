package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[T_A[T_A[(Int,Byte), Char], Int], C]
case class CC_B[D](a: Char, b: Char) extends T_A[T_A[T_A[(Int,Byte), Char], Int], D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}