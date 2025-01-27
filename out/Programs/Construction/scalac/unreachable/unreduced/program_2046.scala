package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[T_A[CC_A[Boolean], CC_A[Int]], T_A[CC_A[Boolean], CC_A[Int]]], T_A[CC_A[Boolean], CC_A[Int]]]

val v_a: T_A[T_A[T_A[T_A[T_A[CC_A[Boolean], CC_A[Int]], T_A[CC_A[Boolean], CC_A[Int]]], T_A[CC_A[Boolean], CC_A[Int]]], T_A[T_A[T_A[CC_A[Boolean], CC_A[Int]], T_A[CC_A[Boolean], CC_A[Int]]], T_A[CC_A[Boolean], CC_A[Int]]]], T_A[T_A[T_A[CC_A[Boolean], CC_A[Int]], T_A[CC_A[Boolean], CC_A[Int]]], T_A[CC_A[Boolean], CC_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), _) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_B()), _) => 1 
}
}