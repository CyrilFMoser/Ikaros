package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Boolean, (Byte,Int)]]) extends T_A[T_A[T_A[Boolean, Boolean], Int], T_A[(Boolean,Char), T_A[Int, Int]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Boolean], Int], T_A[(Boolean,Char), T_A[Int, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], Int], T_A[(Boolean,Char), T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}