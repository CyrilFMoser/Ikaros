package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Byte], T_A], b: T_A, c: T_B[T_A, Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (T_A,T_B[Int, (Byte,Char)]), b: T_B[T_A, CC_B], c: CC_A) extends T_A
case class CC_D[C, D](a: (Byte,Byte), b: T_A, c: CC_B) extends T_B[CC_B, C]
case class CC_E(a: T_B[CC_B, T_A]) extends T_B[CC_B, T_A]
case class CC_F[E](a: CC_C) extends T_B[E, Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A(_, _, _)) => 2 
}
}