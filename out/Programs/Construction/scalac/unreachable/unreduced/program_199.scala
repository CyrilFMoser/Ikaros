package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[T_A[Int, Boolean], Int], c: T_A[T_A[Byte, Int], T_A[Char, (Byte,Int)]]) extends T_A[T_A[Int, Boolean], Int]
case class CC_B() extends T_A[T_A[Int, Boolean], Int]
case class CC_C(a: T_A[CC_B, CC_B], b: CC_B, c: T_A[(CC_A,(Boolean,Int)), CC_B]) extends T_A[T_A[Int, Boolean], Int]

val v_a: T_A[T_A[Int, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B(), _) => 2 
}
}