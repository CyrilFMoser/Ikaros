package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, ((Int,(Byte,Int)),T_A[(Byte,Char), T_B])]
case class CC_B[E](a: E, b: T_B, c: E) extends T_A[E, ((Int,(Byte,Int)),T_A[(Byte,Char), T_B])]
case class CC_C[F](a: T_A[F, F], b: T_B) extends T_A[F, ((Int,(Byte,Int)),T_A[(Byte,Char), T_B])]
case class CC_D(a: CC_B[T_A[T_B, T_B]], b: T_A[T_B, (T_B,Byte)]) extends T_B
case class CC_E(a: Boolean, b: CC_A[CC_C[(Boolean,Boolean)], T_A[T_B, T_B]], c: T_B) extends T_B

val v_a: T_A[Char, ((Int,(Byte,Int)),T_A[(Byte,Char), T_B])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_D(CC_B(_, _, _), _), _) => 1 
  case CC_B(_, CC_E(_, _, _), _) => 2 
  case CC_C(_, CC_D(CC_B(_, _, _), _)) => 3 
  case CC_C(_, CC_E(_, CC_A(), CC_D(_, _))) => 4 
  case CC_C(_, CC_E(_, CC_A(), CC_E(_, _, _))) => 5 
}
}