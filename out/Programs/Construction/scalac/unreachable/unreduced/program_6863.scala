package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A, c: CC_A) extends T_A
case class CC_C(a: (CC_B,CC_A), b: T_B[T_B[Char, Int], T_B[CC_B, T_A]]) extends T_B[(CC_A,Byte), T_B[T_B[Boolean, CC_A], T_B[CC_A, CC_A]]]
case class CC_D(a: T_A, b: T_A, c: CC_B) extends T_B[(CC_A,Byte), T_B[T_B[Boolean, CC_A], T_B[CC_A, CC_A]]]

val v_a: T_B[(CC_A,Byte), T_B[T_B[Boolean, CC_A], T_B[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_, _, _),CC_A(_)), _) => 0 
  case CC_D(CC_A(CC_A(_)), CC_A(_), CC_B(CC_A(_), CC_A(_), _)) => 1 
  case CC_D(CC_A(CC_A(_)), CC_A(_), CC_B(CC_B(_, _, _), CC_A(_), _)) => 2 
  case CC_D(CC_A(CC_A(_)), CC_B(_, _, _), CC_B(CC_A(_), CC_A(_), _)) => 3 
  case CC_D(CC_A(CC_A(_)), CC_B(_, _, _), CC_B(CC_B(_, _, _), CC_A(_), _)) => 4 
  case CC_D(CC_A(CC_B(_, _, _)), CC_A(_), CC_B(CC_A(_), CC_A(_), _)) => 5 
  case CC_D(CC_A(CC_B(_, _, _)), CC_B(_, _, _), CC_B(CC_A(_), CC_A(_), _)) => 6 
  case CC_D(CC_A(CC_B(_, _, _)), CC_B(_, _, _), CC_B(CC_B(_, _, _), CC_A(_), _)) => 7 
  case CC_D(CC_B(_, _, CC_A(_)), CC_A(_), CC_B(CC_A(_), CC_A(_), _)) => 8 
  case CC_D(CC_B(_, _, CC_A(_)), CC_A(_), CC_B(CC_B(_, _, _), CC_A(_), _)) => 9 
  case CC_D(CC_B(_, _, CC_A(_)), CC_B(_, _, _), CC_B(CC_A(_), CC_A(_), _)) => 10 
  case CC_D(CC_B(_, _, CC_A(_)), CC_B(_, _, _), CC_B(CC_B(_, _, _), CC_A(_), _)) => 11 
}
}
// This is not matched: CC_D(CC_A(CC_B(_, _, _)), CC_A(_), CC_B(CC_B(_, _, _), CC_A(_), _))