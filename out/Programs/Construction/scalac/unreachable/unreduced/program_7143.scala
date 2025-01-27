package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Boolean], b: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A, c: Char) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: CC_C, b: CC_A, c: (((Char,Byte),Char),CC_A)) extends T_B[Boolean, C]
case class CC_E[D](a: CC_D[D]) extends T_B[Boolean, D]
case class CC_F[E](a: CC_B, b: CC_A) extends T_B[Boolean, E]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_), CC_A(_, CC_A(_, _)), ((_,_),CC_A(_, _))) => 0 
  case CC_D(CC_C(_), CC_A(_, CC_B(_, _, _)), ((_,_),CC_A(_, _))) => 1 
  case CC_D(CC_C(_), CC_A(_, CC_C(_)), ((_,_),CC_A(_, _))) => 2 
  case CC_E(CC_D(CC_C(_), CC_A(_, _), (_,_))) => 3 
  case CC_F(_, _) => 4 
}
}