package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[Byte, Boolean]], b: T_A[T_A[Byte, Int], T_A[Char, Boolean]]) extends T_A[T_A[Int, T_A[Int, Byte]], T_A[T_A[(Boolean,Char), Boolean], T_A[Boolean, Byte]]]
case class CC_B(a: T_A[CC_A, Char], b: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]]) extends T_A[T_A[Int, T_A[Int, Byte]], T_A[T_A[(Boolean,Char), Boolean], T_A[Boolean, Byte]]]
case class CC_C() extends T_A[T_A[Int, T_A[Int, Byte]], T_A[T_A[(Boolean,Char), Boolean], T_A[Boolean, Byte]]]

val v_a: T_A[T_A[Int, T_A[Int, Byte]], T_A[T_A[(Boolean,Char), Boolean], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}