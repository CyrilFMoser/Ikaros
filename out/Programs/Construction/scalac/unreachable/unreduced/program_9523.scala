package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[(Char,Char)]]]
case class CC_B() extends T_A[T_B[T_B[(Char,Char)]]]
case class CC_C[C](a: CC_B) extends T_A[C]
case class CC_D(a: Boolean, b: T_A[T_B[CC_A]], c: Char) extends T_B[(CC_C[CC_B],CC_A)]
case class CC_E(a: (CC_A,Boolean), b: CC_D) extends T_B[(CC_C[CC_B],CC_A)]
case class CC_F(a: T_B[CC_E], b: CC_B, c: (CC_E,CC_B)) extends T_B[(CC_C[CC_B],CC_A)]

val v_a: T_B[(CC_C[CC_B],CC_A)] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_F(_, CC_B(), (CC_E(_, _),CC_B())) => 1 
}
}
// This is not matched: CC_E((CC_A(),_), CC_D(_, CC_C(_), _))