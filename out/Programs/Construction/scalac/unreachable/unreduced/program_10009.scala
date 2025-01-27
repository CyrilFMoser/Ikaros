package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Char], b: (T_A[Int],T_B[(Byte,Int)]), c: T_A[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_B(a: T_B[T_A[CC_A]]) extends T_A[T_B[Boolean]]
case class CC_C[C](a: C, b: CC_A) extends T_B[C]
case class CC_D[D](a: T_B[T_B[D]], b: Boolean, c: T_B[CC_C[D]]) extends T_B[D]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_A(_, _, _)), (_,CC_C(_, _)), _) => 0 
  case CC_A(CC_D(_, _, _), (_,CC_C(_, _)), _) => 1 
  case CC_A(CC_C(_, CC_A(_, _, _)), (_,CC_D(_, _, _)), _) => 2 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), _) => 3 
  case CC_B(CC_C(_, CC_A(_, _, _))) => 4 
  case CC_B(CC_D(_, _, _)) => 5 
}
}