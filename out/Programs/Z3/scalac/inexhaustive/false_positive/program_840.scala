package Program_30 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A]() extends T_A
case class CC_B(a: CC_A[T_B], b: T_A) extends T_A
case class CC_C(a: CC_A[T_A], b: (T_A,CC_B), c: CC_B) extends T_A
case class CC_D(a: CC_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_B(CC_A(), _) => 2 
  case CC_B(CC_A(), CC_B(_, _)) => 3 
  case CC_C(_, (CC_A(),CC_B(_, _)), CC_B(_, _)) => 4 
  case CC_C(_, (CC_C(_, _, _),CC_B(_, _)), _) => 5 
  case CC_C(CC_A(), (CC_C(_, _, _),CC_B(_, _)), CC_B(_, _)) => 6 
  case CC_C(CC_A(), (CC_C(_, _, _),CC_B(_, _)), _) => 7 
  case CC_C(_, (CC_B(_, _),CC_B(_, _)), _) => 8 
  case CC_C(_, _, _) => 9 
  case CC_C(CC_A(), (CC_A(),CC_B(_, _)), CC_B(_, _)) => 10 
  case CC_C(_, (CC_B(_, _),CC_B(_, _)), CC_B(_, _)) => 11 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_C (T_A (T_A Byte Byte) (T_A Int Int)))