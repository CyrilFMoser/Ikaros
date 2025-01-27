package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[T_A[CC_A]], b: T_B[T_A[Int], CC_A], c: T_A[Int]) extends T_A[Int]
case class CC_C(a: T_B[T_A[Int], T_A[Byte]], b: T_A[Boolean], c: (T_B[CC_B, CC_B],T_A[CC_B])) extends T_A[Int]
case class CC_D[E, D]() extends T_B[E, D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_B(_, _, CC_C(CC_D(), _, (_,_))) => 2 
  case CC_C(CC_D(), _, _) => 3 
}
}
// This is not matched: CC_B(_, _, CC_B(_, CC_D(), _))