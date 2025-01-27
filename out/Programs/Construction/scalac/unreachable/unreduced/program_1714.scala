package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B() extends T_B[T_B[T_B[Char, (Char,Boolean)], T_B[(Boolean,Boolean), Char]], (T_A[Int, Int],T_B[Byte, Int])]
case class CC_C(a: CC_B, b: T_A[CC_B, Boolean], c: T_B[CC_B, CC_A[CC_B, CC_B]]) extends T_B[T_B[T_B[Char, (Char,Boolean)], T_B[(Boolean,Boolean), Char]], (T_A[Int, Int],T_B[Byte, Int])]
case class CC_D(a: CC_A[CC_A[CC_B, CC_C], T_A[CC_B, Boolean]], b: CC_A[CC_B, CC_B]) extends T_B[T_B[T_B[Char, (Char,Boolean)], T_B[(Boolean,Boolean), Char]], (T_A[Int, Int],T_B[Byte, Int])]

val v_a: T_B[T_B[T_B[Char, (Char,Boolean)], T_B[(Boolean,Boolean), Char]], (T_A[Int, Int],T_B[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_A(), _) => 1 
}
}
// This is not matched: CC_D(_, _)