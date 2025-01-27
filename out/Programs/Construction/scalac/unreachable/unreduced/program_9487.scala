package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Char, c: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_A], c: CC_A) extends T_A
case class CC_C(a: T_B[CC_A], b: (Byte,CC_A)) extends T_A
case class CC_D(a: (CC_A,CC_B), b: T_B[T_B[CC_A]]) extends T_B[Byte]
case class CC_E(a: CC_A, b: Int, c: T_A) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _) => 0 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 1 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_B(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_C(_, _), _, CC_A(_, _, _))) => 3 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, CC_B(_, _, _))) => 4 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 5 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_C(_, _), _, CC_B(_, _, _))) => 6 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_B(_, _, _), _, CC_C(_, _))) => 7 
  case CC_E(CC_A(_, _, _), _, CC_A(CC_C(_, _), _, CC_C(_, _))) => 8 
  case CC_E(CC_A(_, _, _), _, CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 9 
  case CC_E(CC_A(_, _, _), _, CC_C(_, _)) => 10 
}
}
// This is not matched: CC_E(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, CC_C(_, _)))