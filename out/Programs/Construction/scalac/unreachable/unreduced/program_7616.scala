package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_A, c: (T_A,T_B[T_A, Int])) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[T_A, (Byte,T_A)], b: (CC_B,CC_B), c: CC_A) extends T_A
case class CC_D[C](a: CC_A, b: C, c: C) extends T_B[C, CC_C]
case class CC_E[D](a: T_A) extends T_B[(CC_C,CC_D[CC_B]), D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(12, CC_A(_, _, _), (_,_))) => 1 
  case CC_B(CC_A(_, CC_A(_, _, _), (_,_))) => 2 
  case CC_B(CC_A(12, CC_B(_), (_,_))) => 3 
  case CC_B(CC_A(_, CC_B(_), (_,_))) => 4 
  case CC_B(CC_A(12, CC_C(_, _, _), (_,_))) => 5 
  case CC_B(CC_A(_, CC_C(_, _, _), (_,_))) => 6 
  case CC_B(CC_B(CC_A(_, _, _))) => 7 
  case CC_B(CC_B(CC_B(_))) => 8 
  case CC_B(CC_B(CC_C(_, _, _))) => 9 
  case CC_B(CC_C(_, _, _)) => 10 
  case CC_C(_, (CC_B(_),CC_B(_)), CC_A(_, CC_A(_, _, _), (_,_))) => 11 
  case CC_C(_, (CC_B(_),CC_B(_)), CC_A(_, CC_B(_), (_,_))) => 12 
  case CC_C(_, (CC_B(_),CC_B(_)), CC_A(_, CC_C(_, _, _), (_,_))) => 13 
}
}