package Program_30 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: C, b: (T_A,CC_A), c: CC_A) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: T_A) extends T_A
case class CC_D[E, D]() extends T_B[E, D]
case class CC_E[F](a: F, b: T_A) extends T_B[(CC_C,T_A), F]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A()) => 0 
  case CC_E(_, CC_C(CC_A(), CC_A(), _)) => 1 
}
}
// This is not matched: CC_E(_, CC_B(_, (_,_), CC_A()))
// This is not matched: CC_A(CC_A(_))