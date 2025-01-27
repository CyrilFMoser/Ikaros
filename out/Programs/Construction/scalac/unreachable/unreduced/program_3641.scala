package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (Char,CC_A), b: (T_B[T_A],CC_A), c: T_B[T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_A, b: T_B[Byte]) extends T_B[T_A]
case class CC_E(a: T_B[T_A], b: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A()), (CC_D(_, _),CC_A()), CC_D(_, _)) => 0 
  case CC_B((_,CC_A()), (CC_D(_, _),CC_A()), CC_E(CC_D(_, _), CC_A())) => 1 
  case CC_B((_,CC_A()), (CC_D(_, _),CC_A()), CC_E(CC_E(_, _), CC_A())) => 2 
  case CC_B((_,CC_A()), (CC_D(_, _),CC_A()), CC_E(CC_D(_, _), CC_B(_, _, _))) => 3 
  case CC_B((_,CC_A()), (CC_D(_, _),CC_A()), CC_E(CC_E(_, _), CC_B(_, _, _))) => 4 
  case CC_B((_,CC_A()), (CC_D(_, _),CC_A()), CC_E(CC_D(_, _), CC_C())) => 5 
  case CC_B((_,CC_A()), (CC_D(_, _),CC_A()), CC_E(CC_E(_, _), CC_C())) => 6 
  case CC_B((_,CC_A()), (CC_E(_, _),CC_A()), CC_D(_, _)) => 7 
  case CC_B((_,CC_A()), (CC_E(_, _),CC_A()), CC_E(CC_D(_, _), CC_A())) => 8 
  case CC_B((_,CC_A()), (CC_E(_, _),CC_A()), CC_E(CC_E(_, _), CC_A())) => 9 
  case CC_B((_,CC_A()), (CC_E(_, _),CC_A()), CC_E(CC_D(_, _), CC_B(_, _, _))) => 10 
  case CC_B((_,CC_A()), (CC_E(_, _),CC_A()), CC_E(CC_E(_, _), CC_B(_, _, _))) => 11 
  case CC_B((_,CC_A()), (CC_E(_, _),CC_A()), CC_E(CC_D(_, _), CC_C())) => 12 
  case CC_B((_,CC_A()), (CC_E(_, _),CC_A()), CC_E(CC_E(_, _), CC_C())) => 13 
  case CC_C() => 14 
}
}
// This is not matched: CC_A()