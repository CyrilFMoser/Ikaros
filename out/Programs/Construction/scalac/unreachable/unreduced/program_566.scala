package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[(Int,Byte), Byte], T_A[T_A[Boolean, Boolean], T_A[Int, Int]]]
case class CC_B(a: T_A[Int, Boolean]) extends T_A[T_A[(Int,Byte), Byte], T_A[T_A[Boolean, Boolean], T_A[Int, Int]]]

val v_a: T_A[T_A[(Int,Byte), Byte], T_A[T_A[Boolean, Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}