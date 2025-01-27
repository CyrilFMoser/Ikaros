package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Int) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]], b: (CC_A,CC_A), c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: Char, b: Int, c: T_A[T_B]) extends T_B
case class CC_D(a: CC_A, b: CC_B) extends T_B

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), _) => 0 
  case CC_A(CC_D(CC_A(_, _), _), _) => 1 
  case CC_B(_, (CC_A(_, _),CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_B(_, (CC_A(_, _),CC_A(_, _)), CC_B(CC_A(_, _), (_,_), CC_A(_, _))) => 3 
  case CC_B(_, (CC_A(_, _),CC_A(_, _)), CC_B(CC_A(_, _), (_,_), CC_B(_, _, _))) => 4 
  case CC_B(_, (CC_A(_, _),CC_A(_, _)), CC_B(CC_B(_, _, _), (_,_), CC_A(_, _))) => 5 
  case CC_B(_, (CC_A(_, _),CC_A(_, _)), CC_B(CC_B(_, _, _), (_,_), CC_B(_, _, _))) => 6 
}
}