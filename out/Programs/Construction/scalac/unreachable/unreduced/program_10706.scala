package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Char], T_A[Byte, Byte]], C]
case class CC_B[D](a: (CC_A[Boolean],Boolean), b: T_A[D, D], c: Byte) extends T_A[T_A[T_A[Char, Char], T_A[Byte, Byte]], D]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Byte, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),true), _, _) => 1 
  case CC_B((CC_A(),false), _, _) => 2 
}
}