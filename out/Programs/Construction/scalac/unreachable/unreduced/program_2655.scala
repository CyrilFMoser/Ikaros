package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], b: T_A[T_A[Byte, Char], Byte]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[T_A[Boolean, Int], T_A[Byte, Int]]]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[T_A[Boolean, Int], T_A[Byte, Int]]]
case class CC_C(a: (CC_B,CC_A)) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[T_A[Boolean, Int], T_A[Byte, Int]]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], T_A[T_A[Boolean, Int], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}