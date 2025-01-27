package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[(Int,Boolean)]]
case class CC_B(a: CC_A[T_A[Int]], b: T_A[T_A[Char]], c: Byte) extends T_A[T_A[(Int,Boolean)]]
case class CC_C(a: Byte) extends T_A[T_A[(Int,Boolean)]]

val v_a: T_A[T_A[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, 0) => 1 
  case CC_B(CC_A(), _, _) => 2 
  case CC_C(0) => 3 
  case CC_C(_) => 4 
}
}