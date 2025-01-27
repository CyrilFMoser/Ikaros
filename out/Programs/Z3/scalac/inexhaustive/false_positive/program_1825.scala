package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Int]
case class CC_B[F]() extends T_B[T_A[F, F], F]
case class CC_C[G, H](a: T_B[H, G], b: (Byte,Int), c: H) extends T_B[T_A[G, G], G]

val v_a: T_B[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (_,12), _) => 1 
  case CC_C(CC_C(_, _, _), (_,12), _) => 2 
  case CC_C(_, (0,12), _) => 3 
  case CC_C(CC_B(), (_,12), _) => 4 
  case CC_C(CC_B(), (0,12), _) => 5 
  case CC_C(CC_C(_, _, _), (0,12), _) => 6 
  case CC_C(_, (0,_), _) => 7 
  case CC_C(CC_C(_, _, _), _, _) => 8 
  case CC_C(_, (_,_), _) => 9 
  case CC_C(CC_B(), _, _) => 10 
  case CC_C(CC_B(), (0,_), _) => 11 
}
}
// This is not matched: (CC_C Int Boolean Wildcard Wildcard Boolean (T_B (T_A Int Int) Int))
// This is not matched: (CC_B T_A)