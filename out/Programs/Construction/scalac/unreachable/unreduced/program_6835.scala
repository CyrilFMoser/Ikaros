package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: (T_B[CC_A],T_B[T_A]), b: T_A, c: B) extends T_A
case class CC_C(a: T_A, b: (T_A,CC_B[T_A])) extends T_B[T_B[Int]]
case class CC_D[C](a: T_A) extends T_B[T_B[Int]]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), (CC_A(),CC_B(_, _, _))) => 0 
  case CC_C(CC_A(), (CC_B(_, _, _),CC_B(_, _, _))) => 1 
  case CC_C(CC_B((_,_), _, _), (CC_A(),CC_B(_, _, _))) => 2 
  case CC_C(CC_B((_,_), _, _), (CC_B(_, _, _),CC_B(_, _, _))) => 3 
  case CC_D(CC_B(_, _, _)) => 4 
}
}
// This is not matched: CC_D(CC_A())