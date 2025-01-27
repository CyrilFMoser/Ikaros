package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[Char]
case class CC_B(a: T_A[Byte], b: CC_A[T_A[Char]], c: Int) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, 12) => 1 
  case CC_B(_, _, _) => 2 
}
}