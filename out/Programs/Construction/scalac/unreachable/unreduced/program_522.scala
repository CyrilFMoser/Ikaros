package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Int],(Boolean,Boolean))]
case class CC_B(a: T_A[(CC_A,CC_A)], b: CC_A) extends T_A[(T_A[Int],(Boolean,Boolean))]

val v_a: T_A[(T_A[Int],(Boolean,Boolean))] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}