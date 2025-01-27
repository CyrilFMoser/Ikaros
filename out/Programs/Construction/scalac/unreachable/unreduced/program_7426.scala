package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: (T_A,Boolean), c: Byte) extends T_A
case class CC_C(a: T_B[T_A, Byte], b: T_A) extends T_A
case class CC_D[C](a: CC_A) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (CC_B(_, _, _),_), _) => 1 
  case CC_B(CC_A(), (CC_C(_, _),_), _) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_A(), (CC_A(),_), _)