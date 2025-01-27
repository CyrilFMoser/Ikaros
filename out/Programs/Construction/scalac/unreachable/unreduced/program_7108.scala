package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[(Int,Boolean), Boolean],T_A[T_B, T_B]), b: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B(a: Boolean, b: (T_A[T_B, Byte],Int)) extends T_B
case class CC_C(a: CC_B, b: (CC_A[T_B],T_A[T_B, CC_B]), c: (CC_A[(Boolean,Boolean)],Byte)) extends T_B
case class CC_D(a: CC_B, b: Char, c: (CC_C,T_A[CC_B, Byte])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_, _),12)) => 0 
  case CC_C(_, (CC_A(_, _),_), _) => 1 
  case CC_D(CC_B(_, _), _, (CC_C(_, _, _),CC_A(_, _))) => 2 
}
}
// This is not matched: CC_B(_, (CC_A(_, _),_))