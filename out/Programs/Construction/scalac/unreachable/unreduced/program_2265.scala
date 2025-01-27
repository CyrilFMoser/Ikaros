package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Byte, b: Char) extends T_A[T_B[((Boolean,Boolean),Byte), T_B[Char, Boolean]], (T_B[Boolean, Boolean],(Byte,Int))]
case class CC_B(a: T_B[CC_A, T_A[CC_A, CC_A]], b: CC_A, c: T_A[T_B[(Char,Byte), CC_A], T_B[CC_A, CC_A]]) extends T_A[T_B[((Boolean,Boolean),Byte), T_B[Char, Boolean]], (T_B[Boolean, Boolean],(Byte,Int))]
case class CC_C[E]() extends T_A[E, CC_B]
case class CC_D[G, F]() extends T_B[F, G]
case class CC_E[I, H](a: T_B[H, I], b: H) extends T_B[H, I]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_B(_, _, _)) => 1 
  case CC_E(CC_E(CC_D(), _), CC_B(_, _, _)) => 2 
  case CC_E(CC_E(CC_E(_, _), _), CC_B(_, _, _)) => 3 
}
}