package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_B(a: T_B[T_B[Boolean]], b: (T_B[Char],T_A[Char]), c: (T_A[Byte],T_A[Char])) extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: T_A[T_B[Byte]], b: T_B[Byte], c: (T_B[CC_B],T_B[Byte])) extends T_B[Byte]
case class CC_D() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _, _), _, _), _, (_,CC_D())) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(CC_A(CC_A(_, _, _), _, _), _, (_,CC_C(_, _, _)))