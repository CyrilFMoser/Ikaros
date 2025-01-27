package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: T_A[T_A[Boolean, Int], T_A[Byte, Int]]) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], (T_A[Boolean, Int],Byte)]
case class CC_B() extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], (T_A[Boolean, Int],Byte)]
case class CC_C(a: T_A[CC_B, CC_A], b: (Boolean,CC_B), c: T_A[CC_B, T_A[(Boolean,Boolean), CC_B]]) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], (T_A[Boolean, Int],Byte)]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], (T_A[Boolean, Int],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, (_,CC_B()), _) => 2 
}
}