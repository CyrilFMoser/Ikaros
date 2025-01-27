package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[(Int,Boolean)]]
case class CC_B(a: T_B[CC_A], b: Byte, c: T_A[T_B[Int]]) extends T_B[Int]
case class CC_C() extends T_B[Int]
case class CC_D(a: T_B[T_B[CC_B]], b: (T_B[Int],T_B[Int]), c: T_A[Byte]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(_, (_,_), _)