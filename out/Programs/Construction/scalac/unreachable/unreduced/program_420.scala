package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Char, ((Byte,Boolean),CC_A)], b: T_A, c: (T_B[T_A, (Int,Char)],CC_A)) extends T_A
case class CC_C[C](a: (Int,Int), b: T_B[Int, C]) extends T_A
case class CC_D[D](a: T_A, b: T_A, c: CC_A) extends T_B[(CC_B,Byte), D]
case class CC_E[E](a: CC_D[E]) extends T_B[(CC_B,Byte), E]
case class CC_F[F](a: Int) extends T_B[(CC_B,Byte), F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C((_,_), _) => 2 
}
}