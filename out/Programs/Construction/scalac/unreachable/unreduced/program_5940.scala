package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, Char], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Int, Char], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]
case class CC_C(a: CC_B, b: Int, c: T_A[Boolean, CC_A]) extends T_A[T_A[T_A[Int, Char], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}