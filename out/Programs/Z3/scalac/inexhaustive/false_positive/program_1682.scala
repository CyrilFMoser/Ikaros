package Program_30 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: T_A) extends T_A
case class CC_C[B](a: B, b: CC_A, c: Byte) extends T_A
case class CC_D[C](a: C, b: T_B[C], c: Char) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, 0) => 1 
  case CC_C(_, CC_A(), 0) => 2 
  case CC_C(_, _, _) => 3 
  case CC_B(CC_D(_, _, _), CC_A()) => 4 
  case CC_B(CC_D(_, _, _), _) => 5 
  case CC_B(_, CC_A()) => 6 
}
}
// This is not matched: (CC_C Boolean Boolean (CC_A T_A) Byte T_A)
// This is not matched: Pattern match is empty without constants