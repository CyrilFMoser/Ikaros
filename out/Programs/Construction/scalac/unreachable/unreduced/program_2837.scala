package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[((Byte,Int),(Boolean,Char))], b: T_B[T_A[Char]], c: Boolean) extends T_A[Int]
case class CC_B(a: T_B[T_A[CC_A]], b: T_B[T_A[Boolean]], c: Int) extends T_A[Int]
case class CC_C(a: Int) extends T_A[Int]
case class CC_D(a: T_B[T_A[Int]], b: T_A[Int], c: CC_B) extends T_B[CC_A]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)