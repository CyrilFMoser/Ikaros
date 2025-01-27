package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (T_B[Char, Boolean],T_B[Boolean, Char]), b: Char, c: T_A[F, E]) extends T_A[E, F]
case class CC_B[G](a: G, b: T_B[G, G], c: Int) extends T_B[G, ((Byte,Boolean),T_B[Byte, (Byte,Byte)])]
case class CC_C[H]() extends T_B[H, ((Byte,Boolean),T_B[Byte, (Byte,Byte)])]
case class CC_D(a: Boolean, b: T_B[Int, T_A[Boolean, Int]], c: Int) extends T_B[T_A[T_A[Char, Boolean], CC_B[Boolean]], ((Byte,Boolean),T_B[Byte, (Byte,Byte)])]

val v_a: T_B[T_A[T_A[Char, Boolean], CC_B[Boolean]], ((Byte,Boolean),T_B[Byte, (Byte,Byte)])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_), _, _), _, _) => 0 
  case CC_C() => 1 
  case CC_D(_, _, _) => 2 
}
}