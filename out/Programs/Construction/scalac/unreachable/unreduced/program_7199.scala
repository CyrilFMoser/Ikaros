package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Boolean], T_A[Byte, Int]], C]
case class CC_B[D](a: (T_A[Boolean, (Int,Boolean)],CC_A[Byte])) extends T_A[T_A[T_A[Char, Boolean], T_A[Byte, Int]], D]
case class CC_C() extends T_A[T_A[T_A[Char, Boolean], T_A[Byte, Int]], CC_B[CC_A[Boolean]]]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Byte, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
}
}