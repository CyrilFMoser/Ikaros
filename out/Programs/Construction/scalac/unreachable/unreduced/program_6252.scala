package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[((Boolean,Boolean),Boolean)]]
case class CC_B(a: CC_A, b: T_A[CC_A], c: CC_A) extends T_A[T_A[((Boolean,Boolean),Boolean)]]

val v_a: T_A[T_A[((Boolean,Boolean),Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}