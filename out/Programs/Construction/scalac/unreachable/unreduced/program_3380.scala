package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], T_B[T_A, (Char,Char)]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: (Boolean,T_B[T_A, CC_A]), b: T_A) extends T_B[C, Byte]
case class CC_D[D]() extends T_B[D, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_B(_), _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}
// This is not matched: CC_B(CC_A(CC_A(_, _), _))