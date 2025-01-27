package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[T_B[T_A, C], C], b: T_B[C, C]) extends T_B[T_B[T_A, C], C]
case class CC_C(a: (T_B[Byte, CC_A],T_B[CC_A, Byte]), b: CC_A, c: T_B[CC_B[CC_A], T_A]) extends T_B[T_B[T_A, T_B[Char, T_B[(Boolean,Char), T_A]]], T_B[Char, T_B[(Boolean,Char), T_A]]]
case class CC_D[D]() extends T_B[T_B[T_A, D], D]

val v_a: T_B[T_B[T_A, CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_D(), _), _) => 0 
  case CC_B(CC_D(), _) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _), _), _)