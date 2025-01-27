package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Int], (Int,Char)], b: T_B[T_A[Boolean, Byte]], c: T_A[T_B[Byte], T_A[(Boolean,Byte), Int]]) extends T_A[T_B[T_B[Char]], T_B[T_B[Boolean]]]
case class CC_B[D](a: Int, b: D, c: CC_A) extends T_B[D]
case class CC_C() extends T_B[T_B[T_A[CC_A, CC_A]]]
case class CC_D(a: T_B[T_B[(Int,Boolean)]]) extends T_B[T_B[T_A[CC_A, CC_A]]]

val v_a: T_B[T_B[T_A[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(12, CC_B(_, _, _), CC_A(_, CC_B(_, _, _), _)) => 0 
  case CC_B(_, CC_B(_, _, _), CC_A(_, CC_B(_, _, _), _)) => 1 
  case CC_C() => 2 
  case CC_D(CC_B(_, _, _)) => 3 
}
}