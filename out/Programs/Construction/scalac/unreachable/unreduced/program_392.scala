package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_A[T_B[Char], T_B[Boolean]], T_B[(Int,Char)]]
case class CC_B[D](a: CC_A, b: CC_A, c: T_A[D, D]) extends T_B[D]
case class CC_C(a: CC_B[Char], b: T_B[T_A[Int, CC_A]]) extends T_B[(T_A[CC_A, CC_A],CC_A)]
case class CC_D(a: Char, b: T_B[(CC_A,CC_A)], c: T_A[CC_B[CC_C], Boolean]) extends T_B[(T_A[CC_A, CC_A],CC_A)]

val v_a: T_B[(T_A[CC_A, CC_A],CC_A)] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A(), _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_B(_, _, _), _) => 2 
}
}