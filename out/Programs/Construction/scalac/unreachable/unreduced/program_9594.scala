package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Int]], Boolean]
case class CC_B(a: CC_A, b: (T_A[Boolean, CC_A],CC_A)) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Int]], Boolean]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Int, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,CC_A())) => 1 
}
}