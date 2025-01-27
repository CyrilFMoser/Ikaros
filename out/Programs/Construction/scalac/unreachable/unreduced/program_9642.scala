package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_A[D], c: T_B[D, D]) extends T_A[T_B[T_A[Char], T_B[Char, Byte]]]
case class CC_B[E](a: CC_A[E], b: E, c: Char) extends T_B[T_B[((Byte,Int),Boolean), Byte], Char]
case class CC_C() extends T_B[T_B[((Byte,Int),Boolean), Byte], Char]
case class CC_D(a: T_B[T_A[CC_C], T_B[(Int,Char), CC_C]], b: Byte) extends T_B[T_B[((Byte,Int),Boolean), Byte], Char]

val v_a: T_B[T_B[((Byte,Int),Boolean), Byte], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, 'x') => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
  case CC_D(_, _) => 3 
}
}