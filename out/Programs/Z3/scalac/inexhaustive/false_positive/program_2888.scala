package Program_30 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: (Byte,T_B), c: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C[A](a: T_A, b: A) extends T_A
case class CC_D(a: T_A, b: CC_C[T_B], c: CC_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), (CC_A(_, _, _),CC_B())) => 2 
  case CC_A(_, (_,CC_D(_, _, _)), (CC_C(_, _),CC_C(_, _))) => 3 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), (CC_B(),CC_C(_, _))) => 4 
  case CC_A(_, (0,CC_D(_, _, _)), (CC_C(_, _),CC_A(_, _, _))) => 5 
  case CC_A(_, (0,CC_D(_, _, _)), (CC_B(),CC_B())) => 6 
  case CC_A(_, (0,CC_D(_, _, _)), (CC_C(_, _),CC_B())) => 7 
  case CC_A(_, (_,CC_D(_, _, _)), (CC_A(_, _, _),CC_C(_, _))) => 8 
  case CC_A(CC_D(_, _, _), _, (CC_A(_, _, _),CC_A(_, _, _))) => 9 
  case CC_A(CC_D(_, _, _), _, (CC_A(_, _, _),CC_B())) => 10 
  case CC_A(_, (_,CC_D(_, _, _)), (CC_C(_, _),CC_B())) => 11 
  case CC_A(CC_D(_, _, _), _, _) => 12 
  case CC_A(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 13 
  case CC_A(_, (0,CC_D(_, _, _)), (CC_B(),CC_C(_, _))) => 14 
  case CC_A(_, _, (CC_C(_, _),CC_C(_, _))) => 15 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), (CC_B(),CC_A(_, _, _))) => 16 
  case CC_A(CC_D(_, _, _), (0,CC_D(_, _, _)), (CC_B(),CC_C(_, _))) => 17 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), _) => 18 
  case CC_A(_, (0,CC_D(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _))) => 19 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), (CC_A(_, _, _),CC_C(_, _))) => 20 
  case CC_A(CC_D(_, _, _), _, (CC_B(),CC_B())) => 21 
  case CC_A(CC_D(_, _, _), _, (CC_B(),CC_C(_, _))) => 22 
  case CC_A(CC_D(_, _, _), (0,CC_D(_, _, _)), (CC_B(),CC_B())) => 23 
  case CC_A(CC_D(_, _, _), (0,CC_D(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _))) => 24 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), (CC_C(_, _),CC_A(_, _, _))) => 25 
  case CC_A(CC_D(_, _, _), (_,CC_D(_, _, _)), (CC_B(),CC_B())) => 26 
  case CC_A(_, (_,CC_D(_, _, _)), (CC_B(),CC_B())) => 27 
  case CC_A(_, (0,CC_D(_, _, _)), (CC_A(_, _, _),CC_B())) => 28 
  case CC_A(_, _, (CC_A(_, _, _),CC_B())) => 29 
  case CC_A(_, _, (CC_C(_, _),CC_A(_, _, _))) => 30 
  case CC_A(_, (_,CC_D(_, _, _)), _) => 31 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_A)
// This is not matched: (CC_B Boolean (T_A (T_A Boolean Char) Char))